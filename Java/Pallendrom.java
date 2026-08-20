public class Main{

}

static void solve(){
    string s = sc.nextLine();
    stack<Character> st = new stack<>();
    for char c : s.toCharArray()){

            st.push(c);
       
    }

    for char c:s.toCharArray()){
        if(c != st.pop(){
            sout("Not a Pallendrom");
            return;
        }
        sout("Pallendrom");
           
    }
}