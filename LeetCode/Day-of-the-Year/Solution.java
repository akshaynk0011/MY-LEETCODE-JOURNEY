const dayOfYear = date => {
    const [y, m, d] = date.split('-').map(Number);
    const pm = !(y % 4) && y !== 1900
        ? [0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335]
        : [0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334];

    return pm[m - 1] + d;
};