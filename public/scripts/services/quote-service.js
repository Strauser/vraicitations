class QuoteService {

    getQuote() {
        return this.getApi('/api/v1/quote');
    }

    getApi(url) {
        return fetch(url, {
            method: 'GET',
            body:JSON.stringify()
        }).then((res) => res.json());
    }

}

