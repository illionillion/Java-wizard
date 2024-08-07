# Java-wizard
Java-wizardは、厨二病をテーマにした魔法使いのテキストベースバトルゲームです。  
プレイヤーは炎または水の属性を持つ魔法使いとなり、敵と戦いながらストーリーを進めていきます。

## 目次

- [紹介](#紹介)
- [特徴](#特徴)
- [始め方](#始め方)
- [使い方](#使い方)
- [クラス図](#クラス図)
- [貢献](#貢献)
- [ライセンス](#ライセンス)

## 紹介

Java-wizardは、プレイヤーが炎の魔法使いまたは水の魔法使いとなり、各ステージで様々な敵と戦いながら進行する冒険ゲームです。  
魔法が支配する世界、炎の魔法使いと水の魔法使いは、古の力を解き放ち、世界の均衡を保つための冒険に挑みます。

## 特徴

- 魔法使いには個別のバックストーリーがあり、各キャラクターは独自の攻撃と特殊能力を持っています。
- 敵キャラクターも多彩で、それぞれ異なる攻撃パターンや特殊能力があります。
- ゲーム進行に応じてストーリーが進展し、キャラクター同士の会話やイベントが楽しめます。

## 始め方

### 必要なもの

- Java Development Kit (JDK)のインストール
- JavaのIDEまたはテキストエディタ (例：IntelliJ IDEA、Eclipse、VS Code)

### インストール

1. このリポジトリをクローンします：

```sh
git clone https://github.com/038bkn/Java-wizard.git
```

2. プロジェクトディレクトリに移動します：

```sh
cd Java-wizard
```

## 使い方

1. お好みのJava IDEまたはテキストエディタでプロジェクトを開きます。
2. `Main`クラスをコンパイルして実行します：

```sh
javac Main.java
java Main
```

3. 画面の指示に従って魔法使いを選び、名前を設定し、冒険を開始します。

## クラス図

以下のクラス図は、ゲーム内の主要なクラスの関係を示しています。

```mermaid
classDiagram
    class GameUtils{
        +random
        +selectWizard(Scanner scanner) Wizard
        +setName(Scanner scanner, Wizard wizard) void
        +setDifficulty(Scanner scanner, Wizard wizard) void
        +printStatus(Wizard wizard, Enemy enemy) void
        +battle(Scanner scanner, Wizard wizard, Enemy enemy) void
        +startStory() void
        +advanceStory(int stage) void
        +characterDialogue(Wizard wizard, Enemy enemy) void
        +endStory(boolean victory) void
    }
    Wizard <|-- WizardFire
    Wizard <|-- WizardWater
    class Wizard{
        <<abstract>>
        -String name
        -int hp
        -int mp
        -String backStory
        #int maxHp
        #int maxMp
        #int normalAttackMpCost
        #int specialAttackMpCost
        +Wizard(String backStory, int mp)
        +getName() String
        +setName(String name) void
        +getHp() int
        +setHp(int hp) void
        +getMp() int
        +setMp(int mp) void
        +getBackStory() String
        +printBackstory() void
        #consumeMp(int mpCost) int
        +takeDamage(int damage) void
        +heal(Random random) int
        +attack(Random random, int targetHp) int
        +specialAbility(Random random, int enemyHp) int
        +attack1(Random random) int
        +attack2(Random random) int
        +attack3(Random random) int
    }
    class WizardWater{
        +WizardWater(String backStory, int mp)
        +attack1(Random random) int
        +attack2(Random random) int
        +attack3(Random random) int
        +specialAbility(Random random, int targetH)
    }
    class WizardFire{
        +WizardFire(String backStory, int mp)
        +attack1(Random random) int
        +attack2(Random random) int
        +attack3(Random random) int
        +specialAbility(Random random, int targetH)
    }

    Enemy <|-- DarkKnight
    Enemy <|-- PhantomMessenger
    Enemy <|-- DragonAvatar
    class Enemy{
        <<abstract>>
        -int hp
        -String name
        +Enemy(String name, int hp, int attackPower)
        +getName() String
        +getHp() int
        +takeDamage(int damage) void
        +attack(Random random, int targetHp) int
        #attack1(int targetHp) int
        #attack2(int targetHp) int
        #attack3(int targetHp) int
        #specialAbility(Wizard targetHp) int
    }
    class DarkKnight{
        +DarkKnight(String name, int hp, int attackPower)
        +attack1(int target) int
        +attack2(int target) int
        +attack3(int target) int
        +specialAbility(Wizard target) int
    }
    class PhantomMessenger{
        +PhantomMessenger(String name, int hp, int attackPower)
        +attack1(int target) int
        +attack2(int target) int
        +attack3(int target) int
        +specialAbility(Wizard target) int
    }
    class DragonAvatar{
        +DragonAvatar(String name, int hp, int attackPower)
        +attack1(int target) int
        +attack2(int target) int
        +attack3(int target) int
        +specialAbility(Wizard target) int
    }
 ```

## 貢献

バグの報告や新機能の提案は大歓迎です。ぜひプルリクエストを送ってください。

## ライセンス

このプロジェクトはMITライセンスのもとで公開されています。詳細については、LICENSEファイルを参照してください。