# Minecraft管理员密码插件
*tags:*```OP Minecraft JAVA Plugins 1.18~1.21.x```

[![https://img.shields.io/npm/l/vue.svg](https://img.shields.io/npm/l/vue.svg)]()
[![github](https://img.shields.io/badge/github-AsZhangKer-brightgreen.svg)](https://github.com/snowdreams1006)
## 功能&版本
此插件的功能：
- 1、让知道密码的玩家可以不用进入后台直接进行OP、DEOP操作等。
  ⚠当config.yml中password字段为默认时，其为``default_password``，玩家在没有没有OP的情况下，可以进行``/giveop <密码> <玩家名>``获取OP
  ⚠务必要修改默认密码！！！
   也可``/deop <密码> <玩家>``取消某玩家的OP,(注意：这会覆盖原版的deop指令，所以你需要使用``/minecraft:deop``)
- 2、可用在权限调试和不方便进入后台。
- 3、注意事项：密码现阶段可被无限尝试，请及时设置复杂密码，不要使用默认密码！不要！！！
- 4、默认密码 ``default_password`` 为弱密码！
## 语言
此项目使用``Java``开发，使用``Gradle``进行构建，没有使用其他第三方库。

## 功能

- 可以自定义``config.yml``中的管理``password``字段。
- 当``key``字段不为``Enabled``时关闭本插件功能。
- 使用``/giveop + 密码 + 玩家名`` 进行OP操作。
- 使用``/deop + 密码 + 玩家名`` 取消OP操作。

## 快速开始
可以下载源码后自行构建(需要提前下载mc插件的库文件等)
也可以下载构建的jar文件
### 指令

```bash
/giveop
/deop
