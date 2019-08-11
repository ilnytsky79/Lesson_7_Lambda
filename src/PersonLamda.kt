class PersonLamda {
    fun add(function: () -> Int){
      print(2 + function.invoke())
    }
}