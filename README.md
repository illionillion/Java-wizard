﻿# java-wizard

```mermaid
classDiagram
    Wizard <|-- WizardFire
    Wizard <|-- WizardWater
    Wizard : +int age
    Wizard : +String gender
    Wizard: +run()
    Wizard: +heal()
    class WizardFire{
        +attack()
    }
    class WizardWater{
        +attack()
    }
    class Slime{
        +int hp
        +slimeAttack()
    }
 ```
