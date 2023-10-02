package app

abstract class BeverageMachineBase {
    private var beverageMechanism: BeverageMechanism = NoBeverageMechanism()

    protected fun selectBeverage(mechanism: BeverageMechanism){
        beverageMechanism = mechanism
    }

    fun pourSomeBeverage(){
        beverageMechanism.pourBeverage()
    }
}