const base = {
    get() {
        return {
            url : "http://localhost:8080/springboott7atu/",
            name: "springboott7atu",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboott7atu/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "在线电子书阅读系统"
        } 
    }
}
export default base
