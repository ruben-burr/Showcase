import {Injectable} from "@angular/core";
import {RestClientService} from "../../common/http/services/rest-client.service";
import {Observable} from "rxjs/Observable";
import "rxjs/add/operator/catch";
import "rxjs/add/operator/map";
import "rxjs/add/observable/throw";
import {TaskListResource} from "./resources/task-list.resource";
/*
 * Service to communicate with Task Resource
 */
@Injectable()
export class TaskService {

    private TASK_RESOURCE_PATH:string = "tasks";

    constructor(private _restClientService: RestClientService) {
    }
    /*
     * Find all shipments
     *
     * @return An observable array of shipments
     */
    public findTasks(): Observable<TaskListResource> {
        return this._restClientService.get(this.TASK_RESOURCE_PATH);
    }

}
