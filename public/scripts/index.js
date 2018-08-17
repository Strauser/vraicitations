var app = new Vue({
  el: '#app',
  data: {
    message : ""
  }
})

fetch('/api/v1/test', {
        method: 'GET',
        body:JSON.stringify()
}).then((res) => res.json())
.then((data) =>  app.message = data.quote)
.catch((err)=>console.error(err))
