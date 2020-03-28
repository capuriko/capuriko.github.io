k,n = map(int,input().split())
a = list(map(int,input().split()))
diffs = [a[i+1]-a[i] for i in range(n-1)] + [k+a[0]-a[-1]]
print(k - max(diffs))
