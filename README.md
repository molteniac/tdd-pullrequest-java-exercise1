## Eclipseで開く

### EclipseのGradleプラグインを使って開く

* Eclipseの ヘルプ -> Eclipseマーケットプレイス から「Gradle」を検索し、Gradle IDE Pack をインストールする
* プロジェクトのインポートで「Gradleプロジェクト」を使って開く

#### 参考
* http://www.task-notes.com/entry/20150416/1429153200


## テストの実行
* Project Explorer で src/test/javaを選択して右クリック
* Run as の JUnit Testを選択

## Build

    ./gradlew clean build
