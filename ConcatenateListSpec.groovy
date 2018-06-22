@Grab(group='org.spockframework', module='spock-core', version='1.1-groovy-2.4', scope='test')

import spock.lang.Specification

class ConcatenateListSpec extends Specification{
  ConcatenateList cl = new ConcatenateList()

  void "first case of data"(){
    given:
      List data = [[[n:1], [n:2]],
                   [[n:1], [n:2]],
                   [[n:1], [n:2]]]
    when:
      def result = cl.add(data)
    then:
      result == [[n:1],[n:2]]
  }

  void "second case of data"(){
    given:
      List data = [[[n:1], [n:2]],
                   [[n:1], [n:2]],
                   [[n:1]]]
    when:
      def result = cl.add(data)
    then:
      result == [[n:1]]
  }

  void "third case of data"(){
    given:
      List data = [[[n:1], [n:2]],
                   [[n:1], [n:2]],
                   [[n:2]]]
    when:
      def result = cl.add(data)
    then:
      result == [[n:2]]
  }

  void "fourth case of data"(){
    given:
      List data = [[[n:1], [n:2], [n:3]],
                   [[n:1], [n:2]]]
    when:
      def result = cl.add(data)
    then:
      result == [[n:1], [n:2]]
  }

  void "fifth case of data"(){
    given:
      List data = [[[n:1], [n:2], [n:3]], 
                   [[n:1], [n:2], [n:3]]]
    when:
      def result = cl.add(data)
    then:
      result == [[n:1], [n:2], [n:3]]
  }

  void "sixth case of data"(){
    given:
      List data = [[[n:1], [n:2], [n:3]],
                   [[n:1], [n:2], [n:3]],
                   [[n:3]]]
    when:
      def result = cl.add(data)
    then:
      result == [[n:3]]
  }

  void "seventh case of data"(){
    given:
      List data = [[[n:1], [n:2], [n:3]],
                   [[n:1], [n:2], [n:3]],
                   [[]]]
    when:
      def result = cl.add(data)
    then:
      result == [[]]
  }

  void "eighth case of data"(){
    given:
       List data = [[[n:1], [n:2]],
                   [[n:1]]]
    when:
      def result = cl.add(data)
    then:
      result == [[n:1]]
  }

  void "nineth case of data"(){
    given:
      List data = [[[n:1], [n:2], [n:3]],
                   [[n:1], [n:2]],
                   [[n:1]]]
    when:
      def result = cl.add(data)
    then:
      result == [[n:1]]
  }
  
}