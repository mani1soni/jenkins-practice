#!/usr/bin/env groovy
def call(){
   sh 'docker run -itd --name test ubuntu'
}
return this.&call()

//class docker {
  //  def first(){
    //   echo 'hello'
   //}
//}
//return new docker();



