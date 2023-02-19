
function isEffectiveDateInRange(effectiveDateStr, partBEffectiveDateStr) {
    const formatter = new Intl.DateTimeFormat('en-US', {month: '2-digit', day: '2-digit', year: '2-digit'});
    var partBEffectiveDate = new Date(formatter.format(new Date(partBEffectiveDateStr)));
    const earliestDate = new Date(partBEffectiveDate.setMonth(partBEffectiveDate.getMonth() - 3));
    earliestDate.setDate(1);
     console.log(earliestDate);
     partBEffectiveDate = new Date(formatter.format(new Date(partBEffectiveDateStr))); 
    const lastDate = new Date(partBEffectiveDate.setMonth(partBEffectiveDate.getMonth() + 5));
    lastDate.setDate(0);
    
    const effectiveDate = new Date(formatter.format(new Date(effectiveDateStr)));
    console.log(lastDate);
    return effectiveDate > earliestDate && effectiveDate < lastDate || effectiveDate.getTime() === earliestDate.getTime() || effectiveDate.getTime() === lastDate.getTime();
  }
  console.log(isEffectiveDateInRange("09/01/23", "04/02/23"));
  