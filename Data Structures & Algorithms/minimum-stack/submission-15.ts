class MinStack {
    s1:number []
    s2:number []
    constructor() {
        this.s1 = []
        this.s2 = []
    }

    /**
     * @param {number} val
     * @return {void}
     */
    push(val: number): void {
        this.s1.push(val)
        val = Math.min(val,this.s2.length>0?this.s2[this.s2.length-1]:val )
        this.s2.push(val)
   
    }
         /**
     * @return {void}
     */
    pop(): void {
        this.s1.pop()
        this.s2.pop()
    }

    /**
     * @return {number}
     */
    top(): number {
        return this.s1[this.s1.length-1]
    }

    /**
     * @return {number}
     */
    getMin(): number {
        return this.s2[this.s2.length-1]
    }
}
