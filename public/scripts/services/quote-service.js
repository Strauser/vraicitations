class QuoteService {

    getQuote() {
        return fetch('/api/v1/quote', {
            method: 'GET',
            body:JSON.stringify()
        }).then((res) => res.json());
    }

}

