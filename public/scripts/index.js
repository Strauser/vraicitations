fetch('https://jsonplaceholder.typicode.com/todos', {
        method: 'POST',
        body:JSON.stringify({title:"a new todo"})
}).then((res) => res.json())
.then((data) =>  console.log(data))
.catch((err)=>console.error(err))

var app = new Vue({
  el: '#app',
  data: {
    message: 'Hello Vue!'
  }
})
