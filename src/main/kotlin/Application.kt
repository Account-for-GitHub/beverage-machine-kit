import app.CocaColaMachine
import app.FantaMachine

fun main(){
    val beverageMachine = FantaMachine()
    beverageMachine.pourSomeBeverage()

    val anotherBeverageMachine = CocaColaMachine()
    anotherBeverageMachine.pourSomeBeverage()
}