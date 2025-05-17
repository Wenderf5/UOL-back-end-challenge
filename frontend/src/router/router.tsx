import { createBrowserRouter } from "react-router";
import { App } from "../App";

//Pages
import { Home } from "../pages/home";

export const router = createBrowserRouter([
    {
        path: "/",
        element: <App />,
        children: [
            {
                path: "/",
                element: <Home />
            }
        ]
    }
]);