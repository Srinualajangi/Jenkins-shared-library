def getAccountID(String environment){
    switch(environment) { 
        case 'dev': 
            return "971422672236"
        case 'qa':
            return "971422672236"
        case 'uat':
            return "971422672236"
        case 'pre-prod':
            return "971422672236"
        case 'prod':
            return "971422672236"
        default:
            return "nothing"
    } 
}