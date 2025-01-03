```groovy
def myMethod(List<String> list) {
  for (int i = 0; i < list.size(); i++) {
    String item = list[i]
    println "Item $i: $item"
    if (item == "stop") {
      return // Now this will exit the method
    }
  }
  println "This will print only if no 'stop' is found"
}

myMethod(['a', 'b', 'stop', 'c'])

//Alternative with break
def myMethod2(List<String> list) {
    list.eachWithIndex { item, index ->
        println "Item $index: $item"
        if (item == "stop") {
            return true // break the loop
        }
    }
    println "This will print only if no 'stop' is found"
} 
myMethod2(['a', 'b', 'stop', 'c']) 
```