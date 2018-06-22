class ConcatenateList{
  def add(List data){
    List listOfUniques = getUniqueValues(data)
    Integer counter = 0
    List<String> nullValue = testVoidValue(data)
    List evaluationList = []
    data.each{ row ->
      if(row == listOfUniques){
        counter++
      }
      else{
        listOfUniques.each{ unique->
          row.each{ cell ->
            if (cell == unique){
              evaluationList << cell
            } else if (cell == []){
              evaluationList << []
            }
          }
        }
      }
    }
    if(counter == data.size()){
      listOfUniques
    } else if (nullValue.contains("null value")){
      [[]]
    } else {
      evaluationList
    }
  }

  List getUniqueValues(List data){
    List listOfUniques = []
    data.each{ evaluation ->
      evaluation.each{
        Map nameOfN = [n:it.n]
        listOfUniques << nameOfN
      }
    }
    listOfUniques.unique()
  }

  List<String> testVoidValue(List data){
    List voidList = []
    List itHasVoidValues = []
    data.each{ row ->      
      row.each{ cell ->
        if(cell == voidList){
          itHasVoidValues << "null value"
        }
      }
    }
    itHasVoidValues
  }

}
