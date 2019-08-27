#!/usr/bin/env groovy
def call(CONTAINER,IMAGE){
   sh "sudo docker run -itd --name '${CONTAINER}' '${IMAGE}'"
}
return this

//class docker {
  //  def first(){
    //   echo 'hello'
   //}
//}
//return new docker();



