def call(){
    echo 'hello'   
}
return [
    call: this.&call
]