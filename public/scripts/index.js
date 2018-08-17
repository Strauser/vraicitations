var app = new Vue({
  el: '#app',
  data: {
    quote : {}
  }
});

new QuoteService().getQuote()
    .then((data) => app.quote = data)
    .catch((err) => console.error(err));