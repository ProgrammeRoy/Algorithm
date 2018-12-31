fun main(args: Array<String>) {
    var numbers = mutableListOf<Int>(4,7,8,4,1)
    var position = 0
    var indexNumChanged = 0

    if (numbers.size>1){
        for ((index1,numPrim) in numbers.withIndex()){
            var smallNumber = numPrim
            var isFinded = false
            for ((index2,numSec) in numbers.withIndex()){
                if (index2>position) {
                    if (numSec < smallNumber) {
                        smallNumber = numSec
                        indexNumChanged = index2
                        isFinded = true
                    }
                }
            }
            if (isFinded){
                numbers[indexNumChanged] = numbers[index1]
                numbers[index1] = smallNumber
            }
            position++

            println(numbers)

        }
    } else{
        println("Tiene menos de dos numeros")
    }
    println(numbers)

}