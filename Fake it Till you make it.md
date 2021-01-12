# Fake it Till you make it
## Separate
Allow a piece of something to be acted on by itself

`"18585555555"`   vs `"1"+"8585555555"`

## Encapsulate
Take a piece and give it a name and ablity to reuse via variable or method extraction. 

`“1” + “858555555”` vs `areaCode + “858555555”`

## Calculate
This is simular to seperate, but does so exposing a calutation undernth. It can also be a conversion (string to int, etc...)
`age = 21` vs `age = 2020 - 1999` vs `age = Date.today.year - 1999`

## Automate
Put something repetative into a loop. 

`numbers = [5,6,7,8,9,10]` vs `numbers = [5..10]`

## Clean
Any step refactoring step that makes the code look nicer

