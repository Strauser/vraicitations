class QuoteService {

    getQuote() {
        return this.getApi('/api/v1/quotes/random');
    }

    getQuotes() {
        return this.getApi('/api/v1/quotes/');
    }

    getApi(url) {
        return fetch(url, {
            method: 'GET',
            body:JSON.stringify()
        }).then((res) => res.json());
    }

}

