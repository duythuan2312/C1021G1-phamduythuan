import { Injectable } from '@angular/core';

function differenceInDays(now: Date, diff: string | number | Date) {

}

@Injectable({
  providedIn: 'root'
})
export class DateUtilService {

  constructor() { }

  DiffToNow(diff: string | number | Date): string {
    const result: string[] = [];
    const now = new Date();
    diff = new Date(diff);

    function differenceInYears(now: Date, diff: Date) {

    }

    const years = differenceInYears(now, diff);

    function addYears(diff: Date, years: any) {
      return undefined;
    }

    // @ts-ignore
    if (years > 0) {
      result.push(`${years} years`);
      diff = addYears(diff, years);
    }

    function differenceInMonths(now: Date, diff: string | number | Date) {

    }

    const months = differenceInMonths(now, diff);
    result.push(`${months} months`);

    function addMonths(diff: string | number | Date, months: void) {
      return undefined;
    }

    // @ts-ignore
    if (months > 0) {
      diff = addMonths(diff, months);
    }

    const days = differenceInDays(now, diff);
    // @ts-ignore
    if (days > 0) {
      result.push(`${days} days`);
    }

    return result.join(' ');
  }

  getDiffToNow(value: any) {
    return '';
  }
}
