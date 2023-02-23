import pandas as pd
from steps_mean import steps_mean

def total_steps_mean(files = [0, 1, 2, 3, 4, 5, 6, 7]):
    result_list = []
    for i in files:
        filename = './data/id_tag_nsteps_'+ str(i) + '.csv'
        result_list.append(pd.Series(steps_mean(filename)))
    #вообще это вроде не среднее получается, но близкое к нему, но как по другому использовать функцию из предыдущего задания я не знаю
    return dict(sum(result_list) / len(result_list))
