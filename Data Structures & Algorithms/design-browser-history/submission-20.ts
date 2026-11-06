class BrowserHistory {
    /**
     * @constructor
     * @param {string} homepage
     */
    history = new Array()
    curr :number
    constructor(homepage) {
        this.history.push(homepage)
        this.curr = 0
    }

    /**
     * @param {string} url
     * @return {void}
     */
    visit(url) {
        this.history.length = ++this.curr
        this.history.push(url)
    }

    /**
     * @param {number} steps
     * @return {string}
     */
    back(steps) {
        this.curr = Math.max(0,this.curr -steps)
        return this.history[this.curr]
    }

    /**
     * @param {number} steps
     * @return {string}
     */
    forward(steps) {

        this.curr = Math.min(this.history.length-1,this.curr +steps)
        return this.history[this.curr]
    }
}
