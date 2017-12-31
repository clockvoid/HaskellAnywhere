# HaskellAnywhere
haskell interpretor powered by http://rextester.com

## Description
このプログラムは，rextester.comのAPIを叩いて，Haskellを実行できるようにしたプログラムです．

このプログラムは，Android上でHaskellを実行できるようにするために作られました．

そのうち，このプログラム単体でデバッグもできるようになったらすごいですね（他人事）

## Installation
動作にはApache Http ClientにClass Pathが通った環境が必要です．

~~上記のことを確認した上で，コンパイルして，カレントディレクトリに入り，`java Main`してください~~
後述する通り，Kotlinでリファクタしたので，できればIntellijを用いていつも通りビルドしてください．そのうちGradleでビルドスクリプト書きます．

## Environment
開発はOracle jdk1.8.0_111（Kotlin 1.2.0）で行っております．

## Dependencies
動作にはAppache Http Clientがひつようです．また，JSON.orgのJava製のJSONパーサを使っているため，GitHubではJava製のアプリケーションであることになっていますが，実際に動かしたいコードはcommit `62d0c0368dd8a54c673fc7ac4ebcedd6bfb69eb9`からKotlin製になっております．動作やテストが安定したら全部Kotlin製にリファクタする予定です．
