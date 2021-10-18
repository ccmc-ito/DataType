# 本プログラムの説明
## 概要
このプログラムは、長方形についての情報を計算・表示するものである。

「**横の長さ**（***width***）」「**縦の長さ**（***height***）」を入力させ、その情報から周囲の長さ（circumference）や面積（area）を計算して表示する。

## 問題1
そのままプログラムを実行すると、正しく周囲の長さを計算・表示できない。これは文字列（String型）で処理をしているためである。
プログラムの問題点を探し、整数型（int型）で計算できるようにせよ。

### 実行例1

    width: 2
    height: 3
    circumference: 10

### 実行例2

    width: 10
    height: 2
    circumference: 24

## 問題2
**面積**（***area***）を計算・表示できるようにコードを追加せよ。なお、乗算（かけ算）を行うときは演算子として「___*___」を利用すること。

### 実行例1

    width: 2
    height: 3
    circumference: 10
    area: 6

### 実行例2

    width: 10
    height: 2
    circumference: 24
    area: 20

## 問題3
大きな整数でも計算できるように、64bitの整数型を利用するよう変更せよ。

### 実行例1

    width: 1000000
    height: 200000
    circumference: 2400000
    area: 200000000000

### 実行例2

    width: 1234567
    height: 890123
    circumference: 4249380
    area: 1098916481741

## 問題4
小数でも計算できるように、浮動小数点数型（***double***型）を利用するよう変更せよ。

### 実行例1

    width: 1000000
    height: 200000
    circumference: 2400000
    area: 2.0E11

### 実行例2

    width: 1.23e+9
    height: 5.5e-5
    circumference: 2.4600000000001097E9
    area: 67650.0