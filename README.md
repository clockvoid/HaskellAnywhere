# HaskellAnywhere
[![Build Status](https://travis-ci.org/clockvoid/HaskellAnywhere.svg?branch=master)](https://travis-ci.org/clockvoid/HaskellAnywhere)

haskell interpretor powered by http://rextester.com

## Description
このプログラムは，rextester.comのAPIを叩いて，Haskellを実行できるようにしたプログラムです．

このプログラムは，Android上でHaskellを実行できるようにするために作られました．

そのうち，このプログラム単体でデバッグもできるようになったらすごいですね（他人事）

## Installation
Gradleプロジェクトになりました！🎉

インストールは以下のようにします．
```
git clone https://github.com/clockvoid/HaskellAnywhere
cd HaskellAnywhere
gradle build
```

必要に応じて，ExecutableJarを作ったり，ライブラリになる普通のJarを作ったりできます．

```
gradle makeExecutableJar
gradle makeNonExecutableJar
```

## Environment
開発はOracle jdk9.0（Kotlin 1.2.21）で行っております．

## Dependencies
動作にはAppache Http Clientが必要です．また，JSON.orgのJava製のJSONパーサを使っているため，GitHubではJava製のアプリケーションであることになっていますが，実際に動かしたいコードはcommit `62d0c0368dd8a54c673fc7ac4ebcedd6bfb69eb9`からKotlin製になっております．動作やテストが安定したら全部Kotlin製にリファクタする予定です．

依存関係はすべてGradleが解決してくれます．
