class MinStack {
    stack :number[] = new Array()
    minstack :number[] = new Array()
    
    constructor() {}

    /**
     * @param {number} val
     * @return {void}
     */
    push(val: number): void {
        this.stack.push(val)
        val = Math.min(val , this.minstack.length> 0 ? this.minstack[this.minstack.length -1] :val )
        this.minstack.push(val)

    }

    /**
     * @return {void}
     */
    pop(): void {
        this.minstack.pop()
        this.stack.pop()
    }

    /**
     * @return {number}
     */
    top(): number {
        return this.stack[this.stack.length -1]
    }

    /**
     * @return {number}
     */
    getMin(): number {
        return this.minstack[this.minstack.length -1]
    }
}
