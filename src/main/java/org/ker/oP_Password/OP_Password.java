package org.ker.oP_Password;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class OP_Password extends JavaPlugin implements CommandExecutor {

    private String password;
    private String keys;
    @Override
    public void onEnable() {
        saveDefaultConfig();
        password = getConfig().getString("password"); //md忘了我把它叫password不叫passwd了
        keys = getConfig().getString("keys");
        getCommand("giveop").setExecutor(this);
        getCommand("deop").setExecutor(this);
    }

    @Override
    public void onDisable() {
        //这里真要写逻辑吗——ker
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length < 2) {
            sender.sendMessage("用法: /" + label + " <腐竹设置的密码（在config.yml中）> <玩家名>");
            return false;
        }

        String inputPassword = args[0];
        String playerName = args[1];

        //这里不但需要去检查玩家输入的密码而且同时还必须看看腐竹有没有开启此功能，防止有人暴力破解，所以推荐密码设置大小写字母+数字杂交体（
        if (!inputPassword.equals(password)) {
            sender.sendMessage("密码补兑!你想入侵OP了是吧！");
            return true;
        }else if(keys != "Enabled"){
            sender.sendMessage("我告诉你哦，腐竹根本没开这个功能！");
            return true;
        }

        // 处理给与 OP 权限
        if (command.getName().equalsIgnoreCase("giveop")) {
            Player player = Bukkit.getPlayer(playerName);
            if (player != null) {
                player.setOp(true);
                sender.sendMessage(  playerName + "，好了好了，给你 OP 权限还不行嘛~.");
            } else {
                sender.sendMessage("这个人似乎不在玩呢，你让我怎么给（");
            }
        }
        // 处理取消 OP 权限
        else if (command.getName().equalsIgnoreCase("deop")) {
            Player player = Bukkit.getPlayer(playerName);
            if (player != null) {
                player.setOp(false);
                sender.sendMessage("已取消 " + playerName + " 的 OP 权限！");
            } else {
                sender.sendMessage("这个人似乎不在玩呢，你让我怎么取消（如果紧急的话就自己改一下op配置文件罢！");
            }
        }

        return true;//帅气的结束（bushi
    }
}
