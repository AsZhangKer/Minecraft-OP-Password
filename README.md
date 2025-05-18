# Minecraft管理员密码插件
*tags:*```OP Minecraft JAVA Plugins 1.18~1.21.x```

[![https://img.shields.io/npm/l/vue.svg](https://img.shields.io/npm/l/vue.svg)]()
[![github](https://img.shields.io/badge/github-AsZhangKer-brightgreen.svg)](https://github.com/snowdreams1006)
## 功能&版本
此插件的功能：
- 1、让知道密码的玩家可以不用进入后台直接进行OP、DEOP操作等。
  -如，当config.yml中password字段为114514时，A没有OP，可以进行``/giveop 114514 A``给与自己OP
   也可``/deop 114514 A``取消自己OP
- 2、可用在权限调试和不方便进入后台。
- 3、注意事项：本插件具有后门性质，请各腐竹小心被入侵！
- 4、默认密码 ``default_password``
## 语言
此项目使用``Java``开发，使用``Gradle``开发。

## 功能特性

- 可以自定义``config.yml``中的管理``密码``和``key``。
- 当``key``不为``Enabled``时关闭本插件功能。
- 使用``/giveop + 密码 + 玩家名`` 进行给与OP操作。
- 使用``/deop + 密码 + 玩家名`` 进行取消OP操作。
- 只有知道密码才可以操作，因为Minecraft聊天框 *没有试错限制* 所以推荐密码强度要高！

## 快速开始
可以下载源码后自行构建（保证最新版）
也可以下载稳定的构建包（JAR文件）
### 指令

```bash
/giveop
/deop
