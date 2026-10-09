class BrowserHistory {
    history = new Array()
    curr =0
    /**
     * @constructor
     * @param {string} homepage
     */
    constructor(homepage) {
        this.history.push(homepage)
    }

    /**
     * @param {string} url
     * @return {void}
     */
    visit(url) {
        while(this.curr < this.history.length-1){
            this.history.pop()

        }
        this.history.push(url)
        this.curr++
    }

    /**
     * @param {number} steps
     * @return {string}
     */
    back(steps) {
        this.curr =Math.max(0,this.curr -steps)
        return this.history[this.curr]

    }

    /**
     * @param {number} steps
     * @return {string}
     */
    forward(steps) {
        this.curr =Math.min(this.history.length -1 ,this.curr +steps)
        return this.history[this.curr]
    }
}
