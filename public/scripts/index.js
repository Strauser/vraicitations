var app = new Vue({
  el: '#app',
  data: {
    quote : {}
  }
})

fetch('/api/v1/test', {
        method: 'GET',
        body:JSON.stringify()
}).then((res) => res.json())
.then((data) =>  app.quote = data)
.catch((err)=>console.error(err))
