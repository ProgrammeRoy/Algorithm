fun main(args: Array<String>){
    var list = arrayOf(9,1,8,2,7,6,4,3,5)
    var num = 0
    var count = 0

    for ((index,numList) in list.withIndex()){
        if (count>0){
            num = numList
            var entry = false
            var saveIndex2 = 0
            for (index2 in (index-1) downTo 0){
                if (num <list[index2]){
                    list[index2+1] = list[index2]
                    saveIndex2 = index2
                    entry = true
                }
            }
            if (entry){
                list[saveIndex2] = num
            }
        }
        count++
    }

    for (item in list){
        print(item)
    }

}