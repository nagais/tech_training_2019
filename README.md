# TDDのはじめ

## パッケージ構成

#### product code directory
  
$DIR_PATH/ddd_sample/src/main/java/sample

$DIR_PATH/ddd_sample/src/main/java/pro

#### test code directory
  
$DIR_PATH/ddd_sample/src/test/java/sample

$DIR_PATH/ddd_sample/src/test/java/pro

## 対応クラス

### Userクラスの仮実装 (sample/*)

##### product code

`UserSample1.java`

##### test code

`UserSample1Test.java`

### Userでの三角測量 (sample/*)

##### product code

`UserSample2.java`

##### test code

`UserSample2Test.java`

### Userでの明白な実装 (sample/*)

##### product code

`UserSample3.java`

##### test code

`UserSample3Test.java`

### 重複除去 (sample/*)

##### product code

- `FizzBuzzFakeIt.java`
- `FizzBuzz.java`

##### test code

- `FizzBuzzFakeItTest.java`
- `FizzBuzzTest.java`

### アサーテーションルーレット (sample/*)

##### product code

`FizzBuzz.java`

##### test code

`FizzBuzzTest.java`

### 実践編 (pro/*)

`FizzBuzz.java`

##### test code

`FizzBuzzTest.java`

## Reference

[テスト駆動開発って何だろう (DevelopersIO)](https://dev.classmethod.jp/study_meeting/read/what-tdd/)

[FizzBuzz 問題をテスト駆動型開発で実装する (準備編)](https://qiita.com/tentom/items/17ca27358bdac764a68b)