import pandas as pd
from matplotlib import pyplot as plt
from sklearn.datasets import load_iris

iris=load_iris()
print(dir(iris))
print(iris.feature_names)
df=pd.DataFrame(iris.data, columns=iris.feature_names)
print(df.head())
df['target']=iris.target
print(df.head())
print(iris.target_names)
print(df[df.target==1].head())
print(df[df.target==2].head())
df['flower_name']=df.target.apply(lambda x:iris.target_names[x])
print(df.head())

df_S=df[df.target==0]
df_Ve=df[df.target==1]
df_Vi=df[df.target==2]

print(df_Ve)
plt.xlabel('petal length (cm)')
plt.ylabel('petal width (cm)')
plt.scatter(df_S['petal length (cm)'],df_S['petal width (cm)'],color='red',marker="*")
plt.scatter(df_Ve['petal length (cm)'],df_Ve['petal width (cm)'],color='green',marker="+")

plt.show()

plt.scatter(df_Vi['sepal length (cm)'],df_Vi['sepal width (cm)'], color='red',marker="*")
plt.scatter(df_Ve['sepal length (cm)'], df_Ve['sepal width (cm)'], color='green',marker="+")
plt.show()
