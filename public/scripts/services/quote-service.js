class QuoteService {

    getQuote() {
        fetch('/api/v1/quote');
    }

    fetch(url) {
        return fetch(url, {
            method: 'GET',
            body:JSON.stringify()
        }).then((res) => res.json());
    }

}

