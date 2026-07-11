#include<bits/stdc++.h>
using namespace std;

struct Node{
    char ch;
    int freq;
    Node *left,*right;

    Node(char c,int f){
        ch=c;
        freq=f;
        left=right=NULL;
    }
};

struct cmp{
    bool operator()(Node* l,Node* r){
        return l->freq>r->freq;
    }
};

void print(Node* root,string s){
    if(!root) return;

    if(root->ch!='$')
        cout<<root->ch<<" : "<<s<<endl;

    print(root->left,s+"0");
    print(root->right,s+"1");
}

int main(){

    char arr[]={'A','B','C','D','E','F'};
    int freq[]={5,9,12,13,16,45};

    priority_queue<Node*,vector<Node*>,cmp> pq;

    for(int i=0;i<6;i++)
        pq.push(new Node(arr[i],freq[i]));

    while(pq.size()!=1){
        Node *l=pq.top(); pq.pop();
        Node *r=pq.top(); pq.pop();

        Node *temp=new Node('$',l->freq+r->freq);
        temp->left=l;
        temp->right=r;

        pq.push(temp);
    }

    print(pq.top(),"");
}