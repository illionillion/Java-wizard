# java-wizard

```mermaid
classDiagram
    Wizard <|-- WizardFire
    Wizard <|-- WizardWater
    Wizard : +String name
    Wizard : +int hp
    Wizard : +int mp
    Wizard: +run()
    Wizard: +heal()
    Wizard: +tingle()
    class WizardFire{
        +attack()
    }
    class WizardWater{
        +attack()
    }
    class Slime{
        +int hp
        +attack()
    }
 ```