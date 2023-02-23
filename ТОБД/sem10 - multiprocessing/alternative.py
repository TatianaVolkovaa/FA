import pandas as pd

def sum_steps(path):
    return pd.read_csv(path).groupby('tags')['n_steps'].sum()

def count_steps(path):
    return pd.read_csv(path).groupby('tags')['n_steps'].count()

def mean_steps(path):
    return dict(sum_steps(path)/count_steps(path))

def total_mean(files = [0, 1, 2, 3, 4, 5, 6, 7]):
    summs = []
    count = []
    for i in files:
        filename = './data/id_tag_nsteps_'+ str(i) + '.csv'
        summs.append(sum_steps(filename))
        count.append(count_steps(filename))
    return dict(sum(summs) / sum(count))
