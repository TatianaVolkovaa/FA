import pandas as pd

def steps_mean(path):
    return dict(pd.read_csv(path).groupby('tags')['n_steps'].mean())
    #return pd.read_csv(path).groupby('tags')['n_steps'].mean()
