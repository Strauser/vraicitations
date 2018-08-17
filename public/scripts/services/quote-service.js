class QuoteService {

    getQuote() {
        return fetch('/api/v1/test', {
            method: 'GET',
            body:JSON.stringify()
        }).then((res) => res.json());
    }

}

