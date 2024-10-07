#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <set>
using namespace std;

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n, x;
    int cnt = 0;
    cin >> n >> x;
    int a[100];
    set<int> check = {};
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }
    int i = 0;
    for (int i = 0; i < n; i++) {
        int tmp = sqrt(x - a[i]);
        if (check.find(tmp) != check.end()) {
            cnt++;
            check.insert(a[i]);
        }
    }
    cout << cnt;
    return 0;
}
