string to_upper(string str){
    for(auto &i: str) {
        i = toupper(i);
    }
    return str;
}