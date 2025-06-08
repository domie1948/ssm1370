const base = {
    get() {
                return {
            url : "http://localhost:8080/ssmb5vlg/",
            name: "ssmb5vlg",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmb5vlg/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "小型企业办公自动化系统"
        } 
    }
}
export default base
