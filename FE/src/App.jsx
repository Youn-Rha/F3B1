import React from "react";
import { Router, Link } from "react-router-dom";
import { Button } from "./components/Button";
import { DropdownMenu, DropdownMenuTrigger, DropdownMenuContent, DropdownMenuItem, DropdownMenuSeparator } from "./components/DropdownMenu";
import { Avatar, AvatarImage, AvatarFallback } from "./components/Avatar";
import { Card, CardContent, CardFooter } from "./components/Card";
import { HeartIcon, LogOutIcon, MessageCircleIcon, SettingsIcon, UserIcon } from "./components/Icons";

function App() {
  return (
    <Router>
      <div className="flex flex-col min-h-[100dvh]">
        <header className="bg-gray-900 text-white py-4 px-6 flex items-center justify-between">
          <Link to="#" className="text-2xl font-bold">
            BaseballStories
          </Link>
          <div className="flex items-center gap-4">
            <Link to="#" className="hover:underline">
              Discover
            </Link>
            <Button variant="outline" size="sm">
              Upload
            </Button>
            <DropdownMenu>
              <DropdownMenuTrigger asChild>
                <Button variant="ghost" size="icon" className="rounded-full">
                  <Avatar className="w-8 h-8 border">
                    <img src="/placeholder.svg" alt="@shadcn" />
                    <AvatarFallback>JD</AvatarFallback>
                  </Avatar>
                </Button>
              </DropdownMenuTrigger>
              <DropdownMenuContent align="end">
                <DropdownMenuItem>
                  <Link to="#" className="flex items-center gap-2">
                    <UserIcon className="w-4 h-4" />
                    Profile
                  </Link>
                </DropdownMenuItem>
                <DropdownMenuItem>
                  <Link to="#" className="flex items-center gap-2">
                    <SettingsIcon className="w-4 h-4" />
                    Settings
                  </Link>
                </DropdownMenuItem>
                <DropdownMenuSeparator />
                <DropdownMenuItem>
                  <Link to="#" className="flex items-center gap-2">
                    <LogOutIcon className="w-4 h-4" />
                    Logout
                  </Link>
                </DropdownMenuItem>
              </DropdownMenuContent>
            </DropdownMenu>
          </div>
        </header>
        <main className="flex-1 bg-gray-100 dark:bg-gray-950">
          <div className="container mx-auto py-8 px-4 md:px-6">
            <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-6">
              <Card className="rounded-lg overflow-hidden">
                <CardContent className="p-0">
                  <img
                    src="/placeholder.svg"
                    width={600}
                    height={400}
                    alt="Baseball photo"
                    className="aspect-video object-cover"
                  />
                </CardContent>
                <CardFooter className="p-4">
                  <div className="flex items-center justify-between">
                    <div className="flex items-center gap-2">
                      <Avatar className="w-8 h-8 border">
                        <img src="/placeholder.svg" alt="@shadcn" />
                        <AvatarFallback>JD</AvatarFallback>
                      </Avatar>
                      <div>
                        <h3 className="font-medium">John Doe</h3>
                        <p className="text-sm text-gray-500 dark:text-gray-400">@johndoe</p>
                      </div>
                    </div>
                    <div className="flex items-center gap-2">
                      <Button variant="ghost" size="icon">
                        <HeartIcon className="w-4 h-4" />
                        <span className="sr-only">Like</span>
                      </Button>
                      <Button variant="ghost" size="icon">
                        <MessageCircleIcon className="w-4 h-4" />
                        <span className="sr-only">Comment</span>
                      </Button>
                    </div>
                  </div>
                  <p className="mt-4 text-sm leading-relaxed">
                    Excited to share my latest baseball photo! Captured the perfect moment during the game.
                  </p>
                </CardFooter>
              </Card>
              <Card className="rounded-lg overflow-hidden">
                <CardContent className="p-0">
                  <img
                    src="/placeholder.svg"
                    width={600}
                    height={400}
                    alt="Baseball photo"
                    className="aspect-video object-cover"
                  />
                </CardContent>
                <CardFooter className="p-4">
                  <div className="flex items-center justify-between">
                    <div className="flex items-center gap-2">
                      <Avatar className="w-8 h-8 border">
                        <img src="/placeholder.svg" alt="@shadcn" />
                        <AvatarFallback>SM</AvatarFallback>
                      </Avatar>
                      <div>
                        <h3 className="font-medium">Sarah Miller</h3>
                        <p className="text-sm text-gray-500 dark:text-gray-400">@sarahmiller</p>
                      </div>
                    </div>
                    <div className="flex items-center gap-2">
                      <Button variant="ghost" size="icon">
                        <HeartIcon className="w-4 h-4" />
                        <span className="sr-only">Like</span>
                      </Button>
                      <Button variant="ghost" size="icon">
                        <MessageCircleIcon className="w-4 h-4" />
                        <span className="sr-only">Comment</span>
                      </Button>
                    </div>
                  </div>
                  <p className="mt-4 text-sm leading-relaxed">
                    Sharing my favorite baseball moment from last season. Can't wait for the new season to start!
                  </p>
                </CardFooter>
              </Card>
              <Card className="rounded-lg overflow-hidden">
                <CardContent className="p-0">
                  <img
                    src="/placeholder.svg"
                    width={600}
                    height={400}
                    alt="Baseball photo"
                    className="aspect-video object-cover"
                  />
                </CardContent>
                <CardFooter className="p-4">
                  <div className="flex items-center justify-between">
                    <div className="flex items-center gap-2">
                      <Avatar className="w-8 h-8 border">
                        <img src="/placeholder.svg" alt="@shadcn" />
                        <AvatarFallback>MJ</AvatarFallback>
                      </Avatar>
                      <div>
                        <h3 className="font-medium">Michael Johnson</h3>
                        <p className="text-sm text-gray-500 dark:text-gray-400">@michaeljohnson</p>
                      </div>
                    </div>
                    <div className="flex items-center gap-2">
                      <Button variant="ghost" size="icon">
                        <HeartIcon className="w-4 h-4" />
                        <span className="sr-only">Like</span>
                      </Button>
                      <Button variant="ghost" size="icon">
                        <MessageCircleIcon className="w-4 h-4" />
                        <span className="sr-only">Comment</span>
                      </Button>
                    </div>
                  </div>
                  <p className="mt-4 text-sm leading-relaxed">
                    Loving the new baseball season so far! Can't wait to see what's in store.
                  </p>
                </CardFooter>
              </Card>
            </div>
          </div>
        </main>
        <footer className="bg-gray-900 text-white py-4 px-6 flex items-center justify-between">
          <p className="text-sm">&copy; 2023 BaseballStories. All rights reserved.</p>
          <div className="flex items-center gap-4">
            <Link to="#" className="hover:underline">
              About
            </Link>
            <Link to="#" className="hover:underline">
              Contact
            </Link>
            <Link to="#" className="hover:underline">
              Terms
            </Link>
            <Link to="#" className="hover:underline">
              Privacy
            </Link>
          </div>
        </footer>
      </div>
    </Router>
  );
}

export default App;
