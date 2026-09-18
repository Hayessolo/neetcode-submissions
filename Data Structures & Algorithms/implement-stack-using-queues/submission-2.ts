class MyStack {
    q1 :number[] = []

    constructor() {
    
    }

    /**
     * @param {number} x
     * @return {void}
     */
    push(x: number): void {
        this.q1.push(x)
    }

    /**
     * @return {number}
     */
    pop(): number {
        return this.q1.pop()
    }

    /**
     * @return {number}
     */
    top(): number {
        return this.q1[this.q1.length-1]
    }

    /**
     * @return {boolean}
     */
    empty(): boolean {
        if (this.q1.length > 0){
            return false
        }else{
            return true
        }

    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * var obj = new MyStack()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.empty()
 */
