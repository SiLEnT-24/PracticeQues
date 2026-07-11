#include<bits/stdc++.h>
using namespace std;

int main() {
    int cost[8][8] = {
        {0,1,2,5,0,0,0,0},
        {0,0,0,0,4,11,0,0},
        {0,0,0,0,9,5,16,0},
        {0,0,0,0,0,0,2,0},
        {0,0,0,0,0,0,0,18},
        {0,0,0,0,0,0,0,13},
        {0,0,0,0,0,0,0,2},
        {0,0,0,0,0,0,0,0}
    };

    int dist[8];

    dist[7]=0;

    for(int i=6;i>=0;i--){
        dist[i]=INT_MAX;

        for(int j=i+1;j<8;j++)
            if(cost[i][j]!=0)
                dist[i]=min(dist[i],cost[i][j]+dist[j]);
    }

    cout<<"Minimum Cost = "<<dist[0];
}